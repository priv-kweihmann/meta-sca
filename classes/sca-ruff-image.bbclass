## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2024, Konrad Weihmann

inherit sca-ruff-core
inherit sca-global

inherit python3-dir

## Add ids to suppress on a recipe level
SCA_RUFF_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_RUFF_EXTRA_FATAL ?= ""

# python3 stdlib packages to filter out in image mode
_SCA_RUFF_PYTHON_STDLIB_PKGS = "\
                                  python3-asyncio \
                                  python3-audio \
                                  python3-codecs \
                                  python3-compile \
                                  python3-compression \
                                  python3-core \
                                  python3-crypt \
                                  python3-ctypes \
                                  python3-curses \
                                  python3-datetime \
                                  python3-db \
                                  python3-debugger \
                                  python3-dev \
                                  python3-difflib \
                                  python3-doctest \
                                  python3-email \
                                  python3-fcntl \
                                  python3-gdbm \
                                  python3-html \
                                  python3-idle \
                                  python3-image \
                                  python3-io \
                                  python3-json \
                                  python3-logging \
                                  python3-mailbox \
                                  python3-math \
                                  python3-mime \
                                  python3-mmap \
                                  python3-modules \
                                  python3-multiprocessing \
                                  python3-netclient \
                                  python3-netserver \
                                  python3-numbers \
                                  python3-pickle \
                                  python3-pkgutil \
                                  python3-plistlib \
                                  python3-pprint \
                                  python3-profile \
                                  python3-pydoc \
                                  python3-resource \
                                  python3-shell \
                                  python3-sqlite3 \
                                  python3-stringold \
                                  python3-syslog \
                                  python3-terminal \
                                  python3-tests \
                                  python3-threading \
                                  python3-tkinter \
                                  python3-unittest \
                                  python3-unixadmin \
                                  python3-venv \
                                  python3-xml \
                                  python3-xmlrpc \
"

# Filter out all python3 stdlib package files
def _sca_ruff_get_python3_stdlib_files(d):
    import oe.packagedata
    res = set()
    for pkg in clean_split(d, "_SCA_RUFF_PYTHON_STDLIB_PKGS"):
        pkgdata = oe.packagedata.read_subpkgdata_dict(pkg, d)
        file_list = pkgdata.get("FILES_INFO", {})
        if isinstance(file_list, str):
            import ast
            file_list = ast.literal_eval(file_list)
        res.update(file_list.keys())
    return " ".join(res)

SCA_FILE_FILTER_EXTRA:append = " ${@_sca_ruff_get_python3_stdlib_files(d)}"
do_sca_ruff_core[doc] = "Lint python code with ruff in image"
do_sca_deploy_ruff_image[doc] = "Deploy results of do_sca_ruff_core"
addtask do_sca_ruff_core before do_image_complete after do_image
addtask do_sca_ruff_core_report after do_sca_ruff_core before do_sca_deploy

DEPENDS += "sca-image-ruff-rules-native"
