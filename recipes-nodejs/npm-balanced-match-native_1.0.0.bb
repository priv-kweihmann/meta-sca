SUMMARY = "NPM: balanced-match"
DESCRIPTION = "Match balanced character pairs, like "{" and "}""
HOMEPAGE = "https://github.com/juliangruber/balanced-match"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085"

SRC_URI = "https://registry.npmjs.org/balanced-match/-/balanced-match-1.0.0.tgz"
SRC_URI[md5sum] = "83d3f9f047e9700f6c4ac4028c4c5c53"
SRC_URI[sha256sum] = "2896602c12d3cef566bfbed7ccdef79232f4f1e00622fc5c9b40737465baffad"

S = "${WORKDIR}/package"

NPM_PKGNAME = "balanced-match"

inherit npmhelper
inherit native
