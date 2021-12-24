## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## This class add php-extensions to php.ini-file

PHP_EXTENSION ?= ""
PHP_INI_FILE ?= "${STAGING_DIR_NATIVE}/${sysconfdir}/php/php.ini"

python do_add_extension() {
    import glob
    import os
    inifile = d.getVar("PHP_INI_FILE")
    if os.path.exists(inifile):
        content = ""
        with open(inifile, "r") as i:
            content = i.read()
        if content.find("%SYSROOT%") != -1:
            content = content.replace("%SYSROOT%", d.getVar("WORKDIR"))
        for ext in [x for x in d.getVar("PHP_EXTENSION").split(" ") if x]:
            if content.find("\nextension={}\n".format(ext)) == -1:
                content += "extension={}\n".format(ext)
        _extdir = [x for x in glob.glob(d.expand("${STAGING_DIR_NATIVE}/usr/lib/php*/extensions/no-debug-non-zts-*")) if os.path.isdir(x)]
        if _extdir:
            _extdir = _extdir[0]
        else:
            bb.error("Cannot find a PHP extention dir in sysroot")
        # forcefully expand extension_dir to the right path
        content += "extension_dir = " + _extdir + "\n"
        with open(inifile, "w") as o:
            o.write(content)
}

do_devshell[prefuncs] += "do_add_extension"
do_pyshell[prefuncs] += "do_add_extension"
do_configure[prefuncs] += "do_add_extension"
