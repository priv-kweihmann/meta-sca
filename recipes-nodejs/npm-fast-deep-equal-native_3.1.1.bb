SUMMARY = "NPM: fast-deep-equal"
DESCRIPTION = "Fast deep equal"
HOMEPAGE = "https://github.com/epoberezkin/fast-deep-equal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea87ade09b9e6da4f2e47904a4ee137b"

SRC_URI = "https://registry.npmjs.org/fast-deep-equal/-/fast-deep-equal-3.1.1.tgz"
SRC_URI[md5sum] = "c8bfad8f04cfebdcab917d7c14bbbf05"
SRC_URI[sha256sum] = "0ea2f9fc31fe0f6ed76412e9fc7144fdf929d62e621381075ec2e4dc87363381"

S = "${WORKDIR}/package"

NPM_PKGNAME = "fast-deep-equal"

inherit npmhelper
inherit native
