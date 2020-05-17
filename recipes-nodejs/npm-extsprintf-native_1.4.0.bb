SUMMARY = "NPM: extsprintf"
DESCRIPTION = "extended POSIX-style sprintf"
HOMEPAGE = "https://github.com/davepacheco/node-extsprintf#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2"

SRC_URI = "https://registry.npmjs.org/extsprintf/-/extsprintf-1.4.0.tgz"
SRC_URI[md5sum] = "ba1a1711c04d7185fdeed8ad6b69d0d2"
SRC_URI[sha256sum] = "b567ce8a7571941a3b0b2eae6e67992c4e47fee9301c47d07fa11f9cfb62f0d2"

S = "${WORKDIR}/package"

NPM_PKGNAME = "extsprintf"

inherit npmhelper
inherit native
