SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.11.1.tgz"
SRC_URI[md5sum] = "3b2013141788351b059e1595dfc4a371"
SRC_URI[sha256sum] = "b9f43bea79a80983ac8431c01e7537c73e2bb8be51ce7e883bb53e407b977764"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
