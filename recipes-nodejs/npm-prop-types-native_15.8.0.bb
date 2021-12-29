SUMMARY = "NPM: prop-types"
DESCRIPTION = "Runtime type checking for React props and similar objects."
HOMEPAGE = "https://facebook.github.io/react/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

DEPENDS = "npm-loose-envify-native \
           npm-object-assign-native \
           npm-react-is-native"

SRC_URI = "https://registry.npmjs.org/prop-types/-/prop-types-15.8.0.tgz"
SRC_URI[md5sum] = "110485696ac22dde73839d50996450e0"
SRC_URI[sha256sum] = "ca4d45ab19d33e56ad0aca86a52132332c8e85261c731b565a3f6a2047659204"

NPM_PKGNAME = "prop-types"

inherit npmhelper
inherit native
