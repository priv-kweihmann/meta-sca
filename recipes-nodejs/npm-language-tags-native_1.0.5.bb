SUMMARY = "NPM: language-tags"
DESCRIPTION = "Work with IANA language tags."
HOMEPAGE = "https://github.com/mattcg/language-tags"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=265;md5=36dbe67f104dcc25e9ae22086390e9bd"

DEPENDS = "npm-language-subtag-registry-native"

SRC_URI = "https://registry.npmjs.org/language-tags/-/language-tags-1.0.5.tgz"
SRC_URI[md5sum] = "4a458e0d4e6e5a80142b431e95876603"
SRC_URI[sha256sum] = "3022342e2e58a2b849b1e1cfa75a6347ef4e44bdc53b9f8cbfce8bbd4a5679e6"

NPM_PKGNAME = "language-tags"

inherit npmhelper
inherit native
