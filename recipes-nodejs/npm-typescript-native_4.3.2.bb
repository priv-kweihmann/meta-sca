SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.3.2.tgz"
SRC_URI[md5sum] = "8ad9e962565ddf86915cc1bb0d029529"
SRC_URI[sha256sum] = "5563c8ad635a9c96bc531aa215dad7d6770babe6797eff91ae9a174cff986575"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
