## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class add php-extensions to php.ini-file

PHP_EXTENSION ?= ""
PHP_INI_FILE ?= "${STAGING_DIR_NATIVE}/${sysconfdir}/php/php.ini"

python do_add_extension() {
    import os
    inifile = d.getVar("PHP_INI_FILE")
    if os.path.exists(inifile):
        content = ""
        changed = False
        with open(inifile, "r") as i:
            content = i.read()
        if content.find("%SYSROOT%") != -1:
            content = content.replace("%SYSROOT%", d.getVar("WORKDIR"))
            changed = True
        for ext in [x for x in d.getVar("PHP_EXTENSION").split(" ") if x]:
            if content.find("\nextension={}\n".format(ext)) == -1:
                content += "extension={}\n".format(ext)
                changed = True
        if changed:
            with open(inifile, "w") as o:
                o.write(content)
}

do_devshell[prefuncs] += "do_add_extension"
do_pyshell[prefuncs] += "do_add_extension"
do_configure[prefuncs] += "do_add_extension"
