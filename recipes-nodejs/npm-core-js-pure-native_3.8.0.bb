SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04ddc8a943888569f9012c4a420f4b09"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.8.0.tgz"
SRC_URI[md5sum] = "d12decfd79c7d09e1fc1ada23e651373"
SRC_URI[sha256sum] = "e0ae52ed7d7ab8a3d3594c76d8f4a1ae20f4cbeb06b413a333966cc36b56d79a"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
