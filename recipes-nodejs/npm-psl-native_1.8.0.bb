SUMMARY = "NPM: psl"
DESCRIPTION = "Domain name parser based on the Public Suffix List"
HOMEPAGE = "https://github.com/lupomontero/psl#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2425d288296fae32e27553694ff40294"

SRC_URI = "https://registry.npmjs.org/psl/-/psl-1.8.0.tgz"
SRC_URI[md5sum] = "3cd0240e8015866865a86fb1b64edead"
SRC_URI[sha256sum] = "ebb53fa274684c016f28a051e3f7e36a7c0138c0e7402495ccd03ce46905520e"

S = "${WORKDIR}/package"

NPM_PKGNAME = "psl"

inherit npmhelper
inherit native
