SUMMARY = "NPM: is-bigint"
DESCRIPTION = "Is this value an ES BigInt?"
HOMEPAGE = "https://github.com/inspect-js/is-bigint#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=291be6f19f64188a89ffd5180aea06f7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-bigint/-/is-bigint-1.0.2.tgz"
SRC_URI[md5sum] = "07643315ba739efb9fa32be87de4af47"
SRC_URI[sha256sum] = "0e7931a1e3289a8cbf2b7e197ce6c7eaa4368e344c55733959340bc7f873142f"

NPM_PKGNAME = "is-bigint"

inherit npmhelper
inherit native
