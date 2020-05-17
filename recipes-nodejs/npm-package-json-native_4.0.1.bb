SUMMARY = "NPM: package-json"
DESCRIPTION = "Get metadata of a package from the npm registry"
HOMEPAGE = "https://github.com/sindresorhus/package-json#readme"

DEPENDS = "npm-got-native npm-registry-auth-token-native npm-registry-url-native npm-semver-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/package-json/-/package-json-4.0.1.tgz"
SRC_URI[md5sum] = "97e8a0f1ef7490e6f23a36a128171e18"
SRC_URI[sha256sum] = "41aae6e759d46ca1fa63fe2792955c9dac36e13c8b1f9fd45eb4918487662dfe"

NPM_PKGNAME = "package-json"

inherit npmhelper
inherit native
