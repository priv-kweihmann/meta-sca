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

SRC_URI = "https://registry.npmjs.org/string.prototype.matchall/-/string.prototype.matchall-4.0.7.tgz"
SRC_URI[md5sum] = "24b490935578eaf21662f1856be5f9ef"
SRC_URI[sha256sum] = "78ff83b1e6848d80e9a54337dc7c703da61cb351588c8f89e38fd988bb1d1417"

NPM_PKGNAME = "string.prototype.matchall"

inherit npmhelper
inherit native
