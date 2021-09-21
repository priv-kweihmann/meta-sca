SUMMARY = "NPM: cli-cursor"
DESCRIPTION = "Toggle the CLI cursor"
HOMEPAGE = "https://github.com/sindresorhus/cli-cursor#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-restore-cursor-native"

SRC_URI = "https://registry.npmjs.org/cli-cursor/-/cli-cursor-3.1.0.tgz"
SRC_URI[md5sum] = "1a20c35a9828d2c7bfaecb16e9760353"
SRC_URI[sha256sum] = "b5cf0e4dc53b84b4daf0f3f6d60e31eb07f7dbfb0f08a908cca6a6d6cb7e984c"

NPM_PKGNAME = "cli-cursor"

inherit npmhelper
inherit native
