SUMMARY = "NPM: fault"
DESCRIPTION = "Functional errors with formatted output"
HOMEPAGE = "https://github.com/wooorm/fault#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-format-native"

SRC_URI = "https://registry.npmjs.org/fault/-/fault-2.0.0.tgz"
SRC_URI[md5sum] = "fb573728b99634a114679cbad73b1582"
SRC_URI[sha256sum] = "8bcab9f06577d91f7ec2da11bd5003cdf27b1428e39a51adb8e23ed81d24231d"

NPM_PKGNAME = "fault"

inherit npmhelper
inherit native
