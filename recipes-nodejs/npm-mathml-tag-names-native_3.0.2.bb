SUMMARY = "NPM: mathml-tag-names"
DESCRIPTION = "List of known MathML tag names"
HOMEPAGE = "https://github.com/wooorm/mathml-tag-names#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mathml-tag-names/-/mathml-tag-names-3.0.2.tgz"
SRC_URI[md5sum] = "490168b891f866fd1d560aabe9d1df74"
SRC_URI[sha256sum] = "6c370054a94f0043cbf35f8800486979b39e8a7db5cc45c3547cbf1237cd536d"

NPM_PKGNAME = "mathml-tag-names"

inherit npmhelper
inherit native
