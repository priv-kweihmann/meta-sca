SUMMARY = "NPM: deep-is"
DESCRIPTION = "node's assert.deepEqual algorithm except for NaN being equal to NaN"
HOMEPAGE = "https://github.com/thlorenz/deep-is"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb19b42ee6322a4b61b6277fb9e13d89"

SRC_URI = "https://registry.npmjs.org/deep-is/-/deep-is-0.1.3.tgz"
SRC_URI[md5sum] = "854cb2d92c24b6c9d6e8122161077666"
SRC_URI[sha256sum] = "9865e2fa7e023c342a65d5b23d73b404043d50b6f2c1c24a459caa6d74aba786"

NPM_PKGNAME = "deep-is"

inherit npmhelper
inherit native
