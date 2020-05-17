SUMMARY = "NPM: deglob"
DESCRIPTION = "Take a list of glob patterns and return an array of file locations, respecting `.gitignore` and allowing for ignore patterns via `package.json`."
HOMEPAGE = "https://github.com/flet/deglob"

DEPENDS = "npm-find-root-native npm-glob-native npm-ignore-native npm-pkg-config-native npm-run-parallel-native npm-uniq-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=005bbd38b9b65195046d4a1e8fc3f5d9"

SRC_URI = "https://registry.npmjs.org/deglob/-/deglob-4.0.1.tgz"
SRC_URI[md5sum] = "1b0debfab5581f4629c633435b18729d"
SRC_URI[sha256sum] = "e411bd003af473fffcc6a29bb1ea402221137e4553712bd84c6825c13616e08c"

NPM_PKGNAME = "deglob"

inherit npmhelper
inherit native
