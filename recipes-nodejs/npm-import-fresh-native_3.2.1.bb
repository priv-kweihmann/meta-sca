SUMMARY = "NPM: import-fresh"
DESCRIPTION = "Import a module while bypassing the cache"
HOMEPAGE = "https://github.com/sindresorhus/import-fresh#readme"

DEPENDS = "npm-parent-module-native npm-resolve-from-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/import-fresh/-/import-fresh-3.2.1.tgz"
SRC_URI[md5sum] = "aee3e65f930a11f5f2474579e4436efa"
SRC_URI[sha256sum] = "ec1d249f32da3c01c1f96d61367faa00fc97ed43a592988fd453fd6ec836180f"

NPM_PKGNAME = "import-fresh"

inherit npmhelper
inherit native
