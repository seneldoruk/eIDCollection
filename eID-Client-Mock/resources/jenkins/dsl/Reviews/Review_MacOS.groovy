import common.Review

def j = new Review
	(
		name: 'MacOS',
		libraries: 'MacOS',
		label: 'MacOS',
		artifacts: 'tmp/*.log',
		allowEmptyArtifacts: true,
		xunit: true
	).generate(this)


j.with
{
	steps
	{
		shell('cd source; cmake -DCMD=IMPORT_PATCH -P cmake/cmd.cmake')

		shell('security unlock-keychain ${KEYCHAIN_CREDENTIALS} ${HOME}/Library/Keychains/login.keychain-db')

		shell('cd source; cmake --preset ci-macos')

		shell('''\
			cmake --build build
			'''.stripIndent().trim())

		shell('''\
			export QT_PLUGIN_PATH=${WORKSPACE}/libs/dist/plugins
			export QML2_IMPORT_PATH=${WORKSPACE}/libs/dist/qml
			ctest -C Debug --test-dir build --output-on-failure
			'''.stripIndent().trim())
	}
}
