SUMMARY = "NPM: cspell-dict-php"
DESCRIPTION = "Php dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/php#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-php/-/cspell-dict-php-1.1.0.tgz"
SRC_URI[md5sum] = "2013b6837d449ff737ea95e66e50a4bd"
SRC_URI[sha256sum] = "fd4981f5aac7a904602c2d27bd02edb468a3276ba5362e3d078d4f3a43fd0167"

NPM_PKGNAME = "cspell-dict-php"

inherit npmhelper
inherit native
