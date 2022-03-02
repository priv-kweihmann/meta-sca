SUMMARY = "NPM: has-symbols"
DESCRIPTION = "Determine if the JS environment has Symbol support. Supports spec, or shams."
HOMEPAGE = "https://github.com/ljharb/has-symbols#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=afee57a289508ed4df3456667778aaf6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-symbols/-/has-symbols-1.0.3.tgz"
SRC_URI[md5sum] = "de53cc38f69c9145fd5613d6457e01b3"
SRC_URI[sha256sum] = "ddcc17682f1e12a9d00a1a8b656af941ed584914e55fc5caf1c2e7ce892ce6a6"

NPM_PKGNAME = "has-symbols"

inherit npmhelper
inherit native
