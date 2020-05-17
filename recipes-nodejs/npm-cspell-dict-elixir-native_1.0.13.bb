SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed3e5a0b776a9ac83bcddfdaa33984b3"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.0.13.tgz"
SRC_URI[md5sum] = "505592d7b2b23aa4c54aaf7c8058ca09"
SRC_URI[sha256sum] = "4d344f6a6cbef93477ea2993d20428cc0f20654b5adba89a143dbc0d65a19a6c"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
