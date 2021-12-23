SUMMARY = "NPM: string.prototype.matchall"
DESCRIPTION = "Spec-compliant polyfill for String.prototype.matchAll"
HOMEPAGE = "https://github.com/es-shims/String.prototype.matchAll#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-get-intrinsic-native \
           npm-has-symbols-native \
           npm-internal-slot-native \
           npm-regexp.prototype.flags-native \
           npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.6.tgz"
SRC_URI[md5sum] = "0dd7d7e84ce80babca65f0039022aa49"
SRC_URI[sha256sum] = "61b7acbf07ba29554253806871663a21e6a3b6b295f2937518aab16d3617e36f"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit native
