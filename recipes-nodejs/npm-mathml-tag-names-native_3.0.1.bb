SUMMARY = "NPM: mathml-tag-names"
DESCRIPTION = "List of known MathML tag-names"
HOMEPAGE = "https://github.com/wooorm/mathml-tag-names#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mathml-tag-names/-/mathml-tag-names-3.0.1.tgz"
SRC_URI[md5sum] = "deddeb8bd42bbca82804180cb4b33831"
SRC_URI[sha256sum] = "915ff97e86e835f6cb1c1fe6df83b6e494d81873debce3cfe8e781336d56360c"

NPM_PKGNAME = "mathml-tag-names"

inherit npmhelper
inherit native
