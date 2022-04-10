SUMMARY = "NPM: domelementtype"
DESCRIPTION = "all the types of nodes in htmlparser2's dom"
HOMEPAGE = "https://github.com/fb55/domelementtype#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/domelementtype/-/domelementtype-2.3.0.tgz"
SRC_URI[md5sum] = "01aee181b3ed7f4c04d437a979bccdaa"
SRC_URI[sha256sum] = "c67164b4a994eaeaecbd968c2e5e5415407ae6fb4486bbb470594154e25feb45"

NPM_PKGNAME = "domelementtype"

inherit npmhelper
inherit native
