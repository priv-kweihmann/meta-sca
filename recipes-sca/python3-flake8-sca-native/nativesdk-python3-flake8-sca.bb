SUMMARY = "Meta recipe for flake8 and plugins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nativesdk-python3-flake8"

S = "${UNPACKDIR}"

inherit sca-description
inherit python3-dir
inherit_defer nativesdk
PACKAGECONFIG ??= "\
                   2020 \
                   async \
                   comprehensions \
                   datetimez \
                   encodings \
                   eradicate \
                   executable \
                   fixme \
                   mutable \
                   quotes \
                   requirements \
                   return \
                   strftime \
                   use-fstring \
                   variables-names \
                   wemake-python \
                  "

PACKAGECONFIG[2020] = ",,nativesdk-python3-flake8-2020"
PACKAGECONFIG[async] = ",,nativesdk-python3-flake8-async"
PACKAGECONFIG[comprehensions] = ",,nativesdk-python3-flake8-comprehensions"
PACKAGECONFIG[datetimez] = ",,nativesdk-python3-flake8-datetimez"
PACKAGECONFIG[encodings] = ",,nativesdk-python3-flake8-encodings"
PACKAGECONFIG[eradicate] = ",,nativesdk-python3-flake8-eradicate"
PACKAGECONFIG[executable] = ",,nativesdk-python3-flake8-executable"
PACKAGECONFIG[fixme] = ",,nativesdk-python3-flake8-fixme"
PACKAGECONFIG[mutable] = ",,nativesdk-python3-flake8-mutable"
PACKAGECONFIG[quotes] = ",,nativesdk-python3-flake8-quotes"
PACKAGECONFIG[return] = ",,nativesdk-python3-flake8-return"
PACKAGECONFIG[requirements] = ",,nativesdk-python3-flake8-requirements"
PACKAGECONFIG[strftime] = ",,nativesdk-python3-flake8-strftime"
PACKAGECONFIG[use-fstring] = ",,nativesdk-python3-flake8-use-fstring"
PACKAGECONFIG[variables-names] = ",,nativesdk-python3-flake8-variables-names"
PACKAGECONFIG[wemake-python] = ",,nativesdk-python3-wemake-python-styleguide"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
SCA_TOOL_DESCRIPTION = "flake8"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-flake8"
