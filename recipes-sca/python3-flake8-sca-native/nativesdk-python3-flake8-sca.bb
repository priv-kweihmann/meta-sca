SUMMARY = "Meta recipe for flake8 and plugins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nativesdk-python3-flake8"

inherit sca-description
inherit python3-dir
inherit nativesdk

PACKAGECONFIG ??= "\
                   2020 \
                   comprehensions \
                   datetimez \
                   dlint \
                   eradicate \
                   executable \
                   expression-complexity \
                   fixme \
                   functions \
                   import-order \
                   mutable \
                   quotes \
                   requirements \
                   return \
                   secure-coding-standard \
                   strict \
                   string-format \
                   variables-names \
                   wemake-python \
                  "

PACKAGECONFIG[2020] = ",,nativesdk-python3-flake8-2020"
PACKAGECONFIG[comprehensions] = ",,nativesdk-python3-flake8-comprehensions"
PACKAGECONFIG[datetimez] = ",,nativesdk-python3-flake8-datetimez"
PACKAGECONFIG[dlint] = ",,nativesdk-python3-flake8-dlint"
PACKAGECONFIG[eradicate] = ",,nativesdk-python3-flake8-eradicate"
PACKAGECONFIG[executable] = ",,nativesdk-python3-flake8-executable"
PACKAGECONFIG[expression-complexity] = ",,nativesdk-python3-flake8-expression-complexity"
PACKAGECONFIG[fixme] = ",,nativesdk-python3-flake8-fixme"
PACKAGECONFIG[functions] = ",,nativesdk-python3-flake8-functions"
PACKAGECONFIG[import-order] = ",,nativesdk-python3-flake8-import-order"
PACKAGECONFIG[mutable] = ",,nativesdk-python3-flake8-mutable"
PACKAGECONFIG[quotes] = ",,nativesdk-python3-flake8-quotes"
PACKAGECONFIG[return] = ",,nativesdk-python3-flake8-return"
PACKAGECONFIG[requirements] = ",,nativesdk-python3-flake8-requirements"
PACKAGECONFIG[secure-coding-standard] = ",,nativesdk-python3-flake8-secure-coding-standard"
PACKAGECONFIG[strict] = ",,nativesdk-python3-flake8-strict"
PACKAGECONFIG[string-format] = ",,nativesdk-python3-flake8-string-format"
PACKAGECONFIG[variables-names] = ",,nativesdk-python3-flake8-variables-names"
PACKAGECONFIG[wemake-python] = ",,nativesdk-python3-wemake-python-styleguide"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
SCA_TOOL_DESCRIPTION = "flake8"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-flake8"
