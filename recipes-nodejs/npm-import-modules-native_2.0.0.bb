SUMMARY = "NPM: import-modules"
DESCRIPTION = "Import all modules in a directory"
HOMEPAGE = "https://github.com/sindresorhus/import-files#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/import-modules/-/import-modules-2.0.0.tgz"
SRC_URI[md5sum] = "812708bc5a8c2ad0cbb0eb6cc73618e6"
SRC_URI[sha256sum] = "e513eaccf79fd78e6eea731d6d784db6ed70bc0528c514e451c587b0c3e242bf"

NPM_PKGNAME = "import-modules"

inherit npmhelper
inherit native
