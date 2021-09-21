SUMMARY = "NPM: log-update"
DESCRIPTION = "Log by overwriting the previous output in the terminal. Useful for rendering progress bars, animations, etc."
HOMEPAGE = "https://github.com/sindresorhus/log-update#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-escapes-native \
           npm-cli-cursor-native \
           npm-slice-ansi-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/log-update/-/log-update-4.0.0.tgz"
SRC_URI[md5sum] = "b9cb96ab1578d62c8e3e97755019e45e"
SRC_URI[sha256sum] = "b13f1d14d4071ec99af9dd00c6ebaa9dd0c239adda1fb815b950568c42eb6e89"

NPM_PKGNAME = "log-update"

inherit npmhelper
inherit native
