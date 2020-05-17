SUMMARY = "NPM: mathml-tag-names"
DESCRIPTION = "List of known MathML tag-names"
HOMEPAGE = "https://github.com/wooorm/mathml-tag-names#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/mathml-tag-names/-/mathml-tag-names-2.1.3.tgz"
SRC_URI[md5sum] = "f1f3ca2b03dcee695659542071ecd45b"
SRC_URI[sha256sum] = "ba107b69587b96fb863d338f67be45a6b23dc8b735e1596862293841816f48e8"

NPM_PKGNAME = "mathml-tag-names"

inherit npmhelper
inherit native
