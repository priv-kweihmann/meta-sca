SUMMARY = "NPM: unified"
DESCRIPTION = "Interface for parsing, inspecting, transforming, and serializing content through syntax trees"
HOMEPAGE = "https://unifiedjs.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

DEPENDS = "npm-bail-native \
           npm-extend-native \
           npm-is-buffer-native \
           npm-is-plain-obj-native \
           npm-trough-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/unified/-/unified-9.2.0.tgz"
SRC_URI[md5sum] = "5881573da8263fccf058623f308c3b18"
SRC_URI[sha256sum] = "85b22d886540f374775c01a623c635a6d60798d3b2b7b52d0edd329a9e6fc969"

NPM_PKGNAME = "unified"

inherit npmhelper
inherit native
