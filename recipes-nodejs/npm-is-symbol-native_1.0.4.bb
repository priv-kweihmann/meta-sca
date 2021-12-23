SUMMARY = "NPM: is-symbol"
DESCRIPTION = "Determine if a value is an ES6 Symbol or not."
HOMEPAGE = "https://github.com/inspect-js/is-symbol#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-symbol/-/is-symbol-1.0.4.tgz"
SRC_URI[md5sum] = "1d481161785d0b7c5a729e39edb86e9a"
SRC_URI[sha256sum] = "7c8fe125590c7cbf68267b069c467cd526b69925072d2f2fe45b2fd46530dc0f"

NPM_PKGNAME = "is-symbol"

inherit npmhelper
inherit native
