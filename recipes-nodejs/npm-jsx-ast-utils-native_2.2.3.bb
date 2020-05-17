SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
DEPENDS = "npm-array-includes-native npm-object.assign-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-2.2.3.tgz"
SRC_URI[md5sum] = "2d40aa29849c39aecc97c83c84a14502"
SRC_URI[sha256sum] = "ca2a7efdd379123e99aeb1fa707c00bba171698385a6f46f2f5038ae75fc1169"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
