# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2021, Konrad Weihmann

# provide proper upstream check pattern for cpan
# cpan version are only a.b, while a.b.c are more like betas

def upstream_check_pattern(d):
    for x in (d.getVar("SRC_URI") or "").split(" "):
        if x.startswith("https://cpan.metacpan.org"):
            _pattern = x.split("/")[-1].replace(d.getVar("PV"), r"(?P<pver>\d+.\d+)")
            return _pattern
    return ""

UPSTREAM_CHECK_REGEX ?= "${@upstream_check_pattern(d)}"
