SUMMARY = "NPM: import-fresh"
DESCRIPTION = "Import a module while bypassing the cache"
HOMEPAGE = "https://github.com/sindresorhus/import-fresh#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-parent-module-native \
           npm-resolve-from-native"

SRC_URI = "https://registry.npmjs.org/import-fresh/-/import-fresh-3.2.2.tgz"
SRC_URI[md5sum] = "d8f4c59214bdce09575f91559aadb721"
SRC_URI[sha256sum] = "380a0caf6b7043ccc968ecf4e2a04e27711da820d997a2eb8010b9d18ac5a3b1"

NPM_PKGNAME = "import-fresh"

inherit npmhelper
inherit native
