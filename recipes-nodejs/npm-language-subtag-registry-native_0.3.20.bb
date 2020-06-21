SUMMARY = "NPM: language-subtag-registry"
DESCRIPTION = "Full BCP 47 language subtag data from the official IANA repository, in JSON format with multiple indices."
HOMEPAGE = "https://github.com/mattcg/language-subtag-registry"

LICENSE = "ODC-By-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=23;md5=9a3c3d4bea6111da998265d1c8650880"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/language-subtag-registry/-/language-subtag-registry-0.3.20.tgz"
SRC_URI[md5sum] = "6ba434d8bdbd57e55c73d13d9a9c8b28"
SRC_URI[sha256sum] = "7eb968d4d7b144bf5ac53c4accdeb27bbc320b1146725c60041911e317c94af0"

NPM_PKGNAME = "language-subtag-registry"

inherit npmhelper
inherit native
