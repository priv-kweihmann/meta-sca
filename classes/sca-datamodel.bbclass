__SCA_DATAMODEL_STORAGE = "[]"

def sca_get_model_class(d, **kwargs):
    class SCADataModel():
        def __init__(self, *args, **kwargs):
            self.File = None
            self.BuildPath = None
            self.Line = "1"
            self.Column = "1"
            self.Severity = None
            self.Message = None
            self.ID = None
            self.PackageName = None
            self.Tool = None
            for k,v in kwargs.items():
                if k in self.__dict__.keys():
                    setattr(self, k, v)
            self.__fixupPaths()
        
        def __fixupPaths(self):
            if self.File:
                if self.BuildPath:
                    if self.File.startswith(self.BuildPath):
                        self.File = self.File.replace(self.BuildPath, "")
                    if self.File.startswith(self.BuildPath[1:]):
                        self.File = self.File.replace(self.BuildPath[1:], "")
                if self.File.startswith("."):
                    self.File = self.File.lstrip(".")
                if self.File.startswith("/"):
                    self.File = self.File.lstrip("/")

        def GetPlainID(self):
            tmp = self.ID or ""
            tool_prefix = [x for x in tmp.split(".") if x == self.Tool]
            _id = [x for x in tmp.split(".") if x != self.Tool]
            if any(tool_prefix):
                return "{}.{}".format(".".join(tool_prefix), "_".join(_id))
            return "_".join(_id)

        def GetFormattedMessage(self):
            return "[Package:{} Tool:{}] {}".format(self.PackageName, self.Tool, self.Message)
        
        def GetFormattedID(self):
            res = self.GetPlainID()
            if res.startswith("{}.{}".format(self.Tool, self.Tool)):
                pass
            elif res.startswith("{}".format(self.Tool)):
                res = "{}.{}".format(self.Tool, res)
            else:
                res = "{}.{}.{}".format(self.Tool, self.Tool, res)
            return res

        def GetPath(self, exportPath=None):
            self.__fixupPaths()
            return os.path.join(exportPath or self.BuildPath or "", self.File)

        def __repr__(self):
            return "{}:{}:{} [{}]: {} ({})".format(self.File, self.Line, self.Column, self.Severity, self.Message, self.ID)

        def __eq__(self, other):
            if isinstance(other, SCADataModel) or issubclass(other, SCADataModel):
                return str(other) == str(self)
            else:
                return False

        def __ne__(self, other):
            return (not self.__eq__(other))

        def __hash__(self):
            return hash(self.__repr__())

        @staticmethod
        def FromDict(_in):
            return SCADataModel(**_in)
        
        @staticmethod
        def FromList(_in):
            return [SCADataModel.FromDict(x) for x in _in]
        
        def ToDict(self):
            return {k:v for k,v in self.__dict__.items() if k[0].isupper() and v}

    return SCADataModel(**kwargs)

def __sca_model_to_list(d, list):
    return [x.ToDict() for x in list]

def sca_get_datamodel(d, path):
    import json
    with open(path, "r") as o:
        _m = sca_get_model_class(d)
        return _m.FromList(json.load(o))
    return []

def sca_add_model_class(d, item):
    import json
    _m = sca_get_model_class(d)
    _t = _m.FromList(json.loads(d.getVar("__SCA_DATAMODEL_STORAGE")))
    _t.append(item)
    d.setVar("__SCA_DATAMODEL_STORAGE", json.dumps(__sca_model_to_list(d, _t)))

def __sca_unique_model(d):
    import json
    _m = sca_get_model_class(d)
    _t = _m.FromList(json.loads(d.getVar("__SCA_DATAMODEL_STORAGE")))
    _t = list(set(_t))
    return __sca_model_to_list(d, _t)

def sca_save_model_to_file(d, path):
    import json
    _t = sca_save_model_to_string(d)
    with open(path, "w") as o:
        bb.warn(str(_t))
        json.dump(_t, o, indent=2, sort_keys=True)

def sca_save_model_to_string(d, model=None):
    import json
    if not model:
        return json.dumps(__sca_unique_model(d))
    else:
        return json.dumps([x.ToDict() for x in model])
