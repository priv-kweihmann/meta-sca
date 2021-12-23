SUMMARY = "NPM: balanced-match"
DESCRIPTION = "Match balanced character pairs, like "{" and "}""
HOMEPAGE = "https://github.com/juliangruber/balanced-match"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/balanced-match/-/balanced-match-2.0.0.tgz"
SRC_URI[md5sum] = "ccfe1eaf94629a030170c10e2bf4c3ec"
SRC_URI[sha256sum] = "561e0fb7b25ac6bebee816546c7fd71c36a2b8f3e5c091212c3e753052fdc9f9"

NPM_PKGNAME = "balanced-match"

inherit npmhelper
inherit native
