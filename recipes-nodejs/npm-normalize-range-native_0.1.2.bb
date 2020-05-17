SUMMARY = "NPM: normalize-range"
DESCRIPTION = "Utility for normalizing a numeric range, with a wrapping function useful for polar coordinates"
HOMEPAGE = "https://github.com/jamestalmage/normalize-range#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=289129afe2c8d393c7a535bcdcbddb86"

SRC_URI = "https://registry.npmjs.org/normalize-range/-/normalize-range-0.1.2.tgz"
SRC_URI[md5sum] = "4877efb5b69779a4712a0513f7b1621c"
SRC_URI[sha256sum] = "c9784e967900e755f72aacb7b8423183a05425ac0d203b998244e320844eac72"

NPM_PKGNAME = "normalize-range"

inherit npmhelper
inherit native
