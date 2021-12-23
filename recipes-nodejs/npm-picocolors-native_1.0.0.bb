SUMMARY = "NPM: picocolors"
DESCRIPTION = "The tiniest and the fastest library for terminal output formatting with ANSI colors"
HOMEPAGE = "https://github.com/alexeyraspopov/picocolors#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aabd5d21f92335888d962fb6ca980f8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/picocolors/-/picocolors-1.0.0.tgz"
SRC_URI[md5sum] = "743f01bf24bb6492555959fdeb7e9918"
SRC_URI[sha256sum] = "6062ec2ba406ea15e5f91a4da300f07eef6505b0e77af3ae92dd471cd915f383"

NPM_PKGNAME = "picocolors"

inherit npmhelper
inherit native
