SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.0.12.tgz"
SRC_URI[md5sum] = "915deeb709a3a3f31e902f834bc49f3b"
SRC_URI[sha256sum] = "cfabd7c3d1e1e799f1109f7ccd1cedd3669f93c5a57d05141737387567117014"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
