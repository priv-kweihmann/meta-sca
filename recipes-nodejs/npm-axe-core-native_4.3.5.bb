SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.3.5.tgz"
SRC_URI[md5sum] = "cf353254d472bf2211de27204996e165"
SRC_URI[sha256sum] = "e69d2934d75d5ad8343d8667f35b3426da5cb2552859497d9d5f673bd13c4a9a"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
