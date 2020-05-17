SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

DEPENDS = "npm-reusify-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.8.0.tgz"
SRC_URI[md5sum] = "99adf41a84ba27064e0c4aee1ce8b781"
SRC_URI[sha256sum] = "e92455dbdc2f224f678e667ed55e5014c6876da25741bbcd2790ddfac3026f77"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
