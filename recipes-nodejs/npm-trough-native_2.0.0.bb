SUMMARY = "NPM: trough"
DESCRIPTION = "Middleware: a channel used to convey a liquid"
HOMEPAGE = "https://github.com/wooorm/trough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=b280acbcf1c2e5ef4ceb6852568d9961"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trough/-/trough-2.0.0.tgz"
SRC_URI[md5sum] = "db09157a5270adb5f54835cb1023f7c7"
SRC_URI[sha256sum] = "1f6f5e46b8361c719a14a816d90cecb7154d355fb30364d7ae6550c1ccbdc696"

NPM_PKGNAME = "trough"

inherit npmhelper
inherit native
