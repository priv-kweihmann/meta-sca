inherit sca-helper

def sca_suppress_init(d, suppress_extra, suppress_file, file_trace=True):
    import os
    import sys
    import re
    import urllib
    import bb

    class SCASuppressItem():
        def __init__(self, _in):
            self.__ID = ".*"
            self.__LineRange = (0, sys.maxsize)
            self.__ColumnRange = (0, sys.maxsize)
            self.__File = None

            if _in:
                self.File, self.ID, self.LineRange, self.ColumnRange = _in.strip().split(",")
            if self.File:
                self.File = re.escape(self.File)
            else:
                self.File = ".*"
    
        def __unquote(self, value):
            return urllib.parse.unquote(value)

        @property
        def File(self):
            return self.__File
    
        @File.setter
        def File(self, value):
            self.__File = self.__unquote(value)

        @property
        def ID(self):
            return self.__ID
    
        @ID.setter
        def ID(self, value):
            self.__ID = self.__unquote(value)

        @property
        def LineRange(self):
            return self.__LineRange
    
        @LineRange.setter
        def LineRange(self, value):
            value = self.__unquote(value)
            if isinstance(value, str) and "-" in value:
                m = re.match(r"(?P<start>\d+)-(?P<end>\d+)", value)
                if m:
                    self.__LineRange = (int(m.group("start")), int(m.group("end")))
            elif value == "*":
                self.__LineRange = (0, sys.maxsize)
            elif str.isdecimal(value):
                self.__LineRange = (int(value), int(value))
            elif isinstance(value, tuple) and len(value) == 2:
                self.__LineRange = value
    
        @property
        def ColumnRange(self):
            return self.__ColumnRange
    
        @ColumnRange.setter
        def ColumnRange(self, value):
            value = self.__unquote(value)
            if isinstance(value, str) and "-" in value:
                m = re.match(r"(?P<start>\d+)-(?P<end>\d+)", value)
                if m:
                    self.__ColumnRange = (int(m.group("start")), int(m.group("end")))
            elif value == "*":    
                self.__ColumnRange = (0, sys.maxsize)
            elif str.isdecimal(value):
                self.__ColumnRange = (int(value), int(value))
            elif isinstance(value, tuple) and len(value) == 2:
                self.__ColumnRange = value

        def __repr__(self):
            return "{}:{}:{}:{}".format(self.File, self.ID, self.LineRange, self.ColumnRange)

        def Match(self, dm):
            return all([
                re.match(self.File, dm.File),
                int(dm.Line) >= self.LineRange[0] and int(dm.Line) <= self.LineRange[1],
                int(dm.Column) >= self.ColumnRange[0] and int(dm.Column) <= self.ColumnRange[1],
                re.match(self.ID, dm.GetFormattedID())
            ])

    class SCASuppress():
        def __init__(self, d, suppress_extra, suppress_file, file_trace=True):
            self.__Items = self.__add_global_items(d, suppress_extra, suppress_file) + self.__add_local_items(d)
            # automatically set to false if running on image
            self.__filetrace = file_trace and not bb.data.inherits_class('image', d)
            self.__tracedfiles = []
            if os.path.exists(d.getVar("SCA_TRACEFILES_LIST") or "/does/not/exist"):
                with open(d.getVar("SCA_TRACEFILES_LIST")) as i:
                    self.__tracedfiles = [x.strip("\n") for x in i.readlines() if x]
    
        def __add_global_items(self, d, suppress_extra, suppress_file):
            res = []
            for i in get_suppress_entries(d, suppress_extra, suppress_file):
                x = SCASuppressItem(None)
                x.ID = i
                res.append(x)
            return res
    
        def __add_local_items(self, d):
            res = []
            for i in clean_split(d, "SCA_SUPPRESS_LOCALS"):
                res.append(SCASuppressItem(i))
            return res
    
        def Suppressed(self, dm):
            return any([x.Match(dm) for x in self.__Items]) or (self.__filetrace and dm.File not in self.__tracedfiles)

    return SCASuppress(d, suppress_extra, suppress_file, file_trace=file_trace)
