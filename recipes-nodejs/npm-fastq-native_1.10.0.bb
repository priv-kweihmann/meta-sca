SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.10.0.tgz"
SRC_URI[md5sum] = "d04ecf2739ee08d1ddcadcaa0efb0003"
SRC_URI[sha256sum] = "4eba2fa856145034b2c935f0b35c279cbea50a67525d195ed81e8a73b00a148d"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
