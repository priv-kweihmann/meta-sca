SUMMARY = "NPM: error-ex"
DESCRIPTION = "Easy error subclassing and stack customization"
HOMEPAGE = "https://github.com/qix-/node-error-ex#readme"

DEPENDS = "npm-is-arrayish-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102"

SRC_URI = "https://registry.npmjs.org/error-ex/-/error-ex-1.3.2.tgz"
SRC_URI[md5sum] = "5d2c673565060037f9e04d7975d04feb"
SRC_URI[sha256sum] = "1ab2a842de0e106a8ec57b85de97cd87105131e3b12cbbd040fde26860cdfe89"

NPM_PKGNAME = "error-ex"

inherit npmhelper
inherit native
