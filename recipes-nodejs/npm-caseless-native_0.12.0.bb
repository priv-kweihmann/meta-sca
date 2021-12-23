SUMMARY = "NPM: caseless"
DESCRIPTION = "Caseless object set/get/has, very useful when working with HTTP headers."
HOMEPAGE = "https://github.com/mikeal/caseless#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3"

SRC_URI = "https://registry.npmjs.org/caseless/-/caseless-0.12.0.tgz"
SRC_URI[md5sum] = "a56bd266e79aba281ea50cf2dba000fa"
SRC_URI[sha256sum] = "4d7eb172144890213264deda324bd94a7654302265d18e66bfaa63a351fdae98"

S = "${WORKDIR}/package"

NPM_PKGNAME = "caseless"

inherit npmhelper
inherit native
