SUMMARY = "NPM: core-js"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04ddc8a943888569f9012c4a420f4b09"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js/-/core-js-2.6.12.tgz"
SRC_URI[md5sum] = "a1881352eef45832b331dc025db1b72c"
SRC_URI[sha256sum] = "872ff3c544c43364a0a1b4c541e7ab990f4d1dbcc0101ef07d6da90ba3e4aa45"

NPM_PKGNAME = "core-js"

inherit npmhelper
inherit native
