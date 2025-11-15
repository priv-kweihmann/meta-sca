## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2022, Konrad Weihmann

# this class trims down the go compile logs of a failed
# task to a human comprehendible level, by removing all
# the useless HASH entries - so one is actually able to
# find the error

addhandler go_error_handler
go_error_handler[eventmask] = "bb.build.TaskFailed"
python go_error_handler() {
    if isinstance(e, bb.build.TaskFailed) and e._task == 'do_compile':
        if bb.data.inherits_class('gosrc', d):
            result = []
            try:
                with open(e.logfile) as i:
                    result = [x.strip() for x in i.readlines() if 'HASH' not in x ]
                with open(e.logfile, 'w') as o:
                    o.write('\n'.join(result))
            except:
                pass
}
