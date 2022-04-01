SUMMARY = "NPM: obj-props"
DESCRIPTION = "List of properties for JavaScript objects"
HOMEPAGE = "https://github.com/dustinspecker/obj-props#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d8beadf9a6499a20c088624cd844e547"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/obj-props/-/obj-props-1.4.0.tgz"
SRC_URI[md5sum] = "ace7f0609a71a11dbb9532032b2acab8"
SRC_URI[sha256sum] = "41eaa9b49ccc882b9db952d448a180d1c4a5ee17c344634c046ff58ecb4da71a"

NPM_PKGNAME = "obj-props"

inherit npmhelper
inherit native
