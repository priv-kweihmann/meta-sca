SUMMARY = "NPM: fastq"
DESCRIPTION = "Fast, in memory work queue"
HOMEPAGE = "https://github.com/mcollina/fastq#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78523ef0bd3eb9fefc799bbe84780631"

DEPENDS = "npm-reusify-native"

SRC_URI = "https://registry.npmjs.org/fastq/-/fastq-1.10.1.tgz"
SRC_URI[md5sum] = "3a9ad9e3c8d255e3e238b52ee99613d4"
SRC_URI[sha256sum] = "5b6bdcb80b761fad52a6e773c135bd4bfa45c491e942739fe6c7d119e95df388"

NPM_PKGNAME = "fastq"

inherit npmhelper
inherit native
